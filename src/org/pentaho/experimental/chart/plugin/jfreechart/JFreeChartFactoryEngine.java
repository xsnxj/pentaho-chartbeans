package org.pentaho.experimental.chart.plugin.jfreechart;

import java.io.Serializable;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.pentaho.experimental.chart.ChartDocumentContext;
import org.pentaho.experimental.chart.core.ChartDocument;
import org.pentaho.experimental.chart.css.styles.ChartSeriesType;
import org.pentaho.experimental.chart.data.ChartTableModel;
import org.pentaho.experimental.chart.plugin.IChartPlugin;
import org.pentaho.experimental.chart.plugin.api.ChartResult;
import org.pentaho.experimental.chart.plugin.api.IOutput;
import org.pentaho.experimental.chart.plugin.jfreechart.chart.JFreeBarChartGeneratorFactory;
import org.pentaho.experimental.chart.plugin.jfreechart.dataset.DatasetGeneratorFactory;
import org.pentaho.experimental.chart.plugin.jfreechart.outputs.JFreeChartOutput;
import org.pentaho.experimental.chart.plugin.jfreechart.utils.JFreeChartUtils;
import org.pentaho.reporting.libraries.css.values.CSSConstant;
import org.pentaho.util.messages.Messages;

public class JFreeChartFactoryEngine implements Serializable {

  private static final long serialVersionUID = -1079376910255750394L;

  public JFreeChartFactoryEngine(){
  }

  public IOutput makeChart(final ChartTableModel data, final ChartDocumentContext chartDocumentContext, final ChartResult chartResult) {
    final ChartDocument chartDocument = chartDocumentContext.getChartDocument();
    final CSSConstant currentChartType = JFreeChartUtils.determineChartType(chartDocument);
    if (currentChartType == ChartSeriesType.UNDEFINED) {
      chartResult.setErrorCode(IChartPlugin.ERROR_INDETERMINATE_CHART_TYPE);
      chartResult.setDescription(Messages.getErrorString("JFreeChartPlugin.ERROR_0001_CHART_TYPE_INDETERMINABLE")); //$NON-NLS-1$
    }

    if (currentChartType == ChartSeriesType.BAR) {
      try {
        final JFreeChart chart = makeBarChart(data, chartDocumentContext);
        return new JFreeChartOutput(chart);
      } catch (Exception e) {
        chartResult.setErrorCode(IChartPlugin.RESULT_ERROR);
        chartResult.setDescription(e.getLocalizedMessage());
      }
    } else if (currentChartType == ChartSeriesType.LINE) {
      try {
        return new JFreeChartOutput(makeLineChart(data, chartDocumentContext));
      } catch (Exception e) {
        chartResult.setErrorCode(IChartPlugin.RESULT_ERROR);
        chartResult.setDescription(e.getLocalizedMessage());
      }
    }
  
    return null;
  }

  /* (non-Javadoc)
   * @see org.pentaho.experimental.chart.plugin.api.engine.ChartFactoryEngine#makeAreaChart(org.pentaho.experimental.chart.data.ChartTableModel, org.pentaho.experimental.chart.core.ChartDocument, org.pentaho.experimental.chart.plugin.api.IOutput)
   */
  public void makeAreaChart(final ChartTableModel data, final ChartDocument chartDocument, final IOutput outHandler) {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see org.pentaho.experimental.chart.plugin.api.engine.ChartFactoryEngine#makeBarChart(org.pentaho.experimental.chart.data.ChartTableModel, org.pentaho.experimental.chart.core.ChartDocument, org.pentaho.experimental.chart.plugin.api.IOutput)
   */
  public JFreeChart makeBarChart(final ChartTableModel data, final ChartDocumentContext chartDocumentContext)
      throws Exception {
    final ChartDocument chartDocument = chartDocumentContext.getChartDocument();
    final JFreeChart chart = createBarChartSubtype(chartDocumentContext, data);
    JFreeChartUtils.setPlotAttributes(chart.getCategoryPlot(), chartDocument, data);

    return chart;
  }

  private JFreeChart createBarChartSubtype(final ChartDocumentContext chartDocumentContext, final ChartTableModel data) {
    final JFreeBarChartGeneratorFactory chartFacEngine = new JFreeBarChartGeneratorFactory();
    final JFreeChart chart = chartFacEngine.createChart(chartDocumentContext, data);
    return chart;
  }

  /* (non-Javadoc)
   * @see org.pentaho.experimental.chart.plugin.api.engine.ChartFactoryEngine#makeLineChart(org.pentaho.experimental.chart.data.ChartTableModel, org.pentaho.experimental.chart.core.ChartDocument, org.pentaho.experimental.chart.plugin.api.IOutput)
   */
  private JFreeChart makeLineChart(final ChartTableModel data, final ChartDocumentContext chartDocumentContext) {
    final ChartDocument chartDocument = chartDocumentContext.getChartDocument();
    final String title = JFreeChartUtils.getTitle(chartDocument);
    final String valueCategoryLabel = JFreeChartUtils.getValueCategoryLabel(chartDocument);
    final String valueAxisLabel = JFreeChartUtils.getValueAxisLabel(chartDocument);
    final PlotOrientation orientation = JFreeChartUtils.getPlotOrientation(chartDocument);
    final boolean legend = JFreeChartUtils.getShowLegend(chartDocument);
    final boolean toolTips = JFreeChartUtils.getShowToolTips(chartDocument);
    final JFreeChart chart = createLineChartSubtype(chartDocumentContext, data, title, valueCategoryLabel, valueAxisLabel, orientation, legend, toolTips);
    JFreeChartUtils.setPlotAttributes(chart.getCategoryPlot(), chartDocument, data);

    return chart;
  }

 /**
   * @param chartDocumentContext
   * @param data
   * @param title
   * @param valueCategoryLabel
   * @param valueAxisLabel
   * @param orientation
   * @param legend
   * @param toolTips
   * @return
   */
  private JFreeChart createLineChartSubtype(ChartDocumentContext chartDocumentContext, ChartTableModel data, String title, String valueCategoryLabel, String valueAxisLabel, PlotOrientation orientation, boolean legend, boolean toolTips) {
    JFreeChart chart = null;
    DatasetGeneratorFactory datasetGeneratorFactory = new DatasetGeneratorFactory();
    DefaultCategoryDataset dataset = datasetGeneratorFactory.createDefaultCategoryDataset(chartDocumentContext, data);
    chart = ChartFactory.createLineChart(title, valueAxisLabel, valueAxisLabel, dataset, orientation, legend, toolTips, toolTips);
    return chart;
  }

}
