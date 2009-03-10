package org.pentaho.chart.model;

import java.io.Serializable;
import java.util.HashMap;

import org.pentaho.chart.model.Theme.ChartTheme;

public class ChartModel implements Serializable {
  public enum ChartEngine{JFREE, OPENFLASH};
  
  HashMap<String, String> styles = new HashMap<String, String>();
  
  String title;
  String subtitle;
  ChartLegend chartLegend;
  Integer backgroundColor;
  Plot plot;
  ChartEngine chartEngine = ChartEngine.OPENFLASH;
  ChartTheme theme;
  
  public ChartEngine getChartEngine() {
    return chartEngine;
  }

  public void setChartEngine(ChartEngine chartEngine) {
    this.chartEngine = chartEngine;
  }

  public ChartTheme getTheme() {
    return theme;
  }

  public void setTheme(ChartTheme theme) {
    this.theme = theme;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ChartLegend getChartLegend() {
    return chartLegend;
  }

  public void setChartLegend(ChartLegend chartLegend) {
    this.chartLegend = chartLegend;
  }

  public Integer getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Integer backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public Plot getPlot() {
    return plot;
  }

  public void setPlot(Plot plot) {
    this.plot = plot;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public HashMap<String, String> getStyles() {
    return styles;
  }
}