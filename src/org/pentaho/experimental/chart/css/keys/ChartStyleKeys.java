/*
 * Copyright 2007 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 *
 * Created 3/13/2008 
 * @author David Kincade 
 */
package org.pentaho.experimental.chart.css.keys;

import org.pentaho.reporting.libraries.css.model.StyleKey;
import org.pentaho.reporting.libraries.css.model.StyleKeyRegistry;

/**
 * Defines all the charting specific style keys
 *
 * @author David Kincade, Ravi Hasija
 */
public class ChartStyleKeys {

  /**
   * The chart type: bar, line, pie etc.
   */
  public static final StyleKey CHART_TYPE = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-series-type", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The orientation of the charts: vertical or horizontal.
   */
  public static final StyleKey ORIENTATION = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-orientation", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The line style for line charts (solid, dashed, etc.)
   */
  public static final StyleKey LINE_STYLE = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-line-style", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The visibility of the line
   */
  public static final StyleKey LINE_VISIBLE = StyleKeyRegistry.getRegistry().
  createKey("-x-pentaho-chart-line-visible", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$
  
  /**
   * The visibility of the markers
   */
  public static final StyleKey MARKER_VISIBLE = StyleKeyRegistry.getRegistry().
  createKey("-x-pentaho-chart-marker-visible", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$
  
  /**
   * The shape of the marker (ie. Rectangle, Elipse, arc, etc..)
   */
  public static final StyleKey MARKER_SHAPE = StyleKeyRegistry.getRegistry().
  createKey("-x-pentaho-chart-marker-shape", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$
  
  /**
   * The line width for line charts (thin, medium, thick, 5px, 0.1cm)
   */
  public static final StyleKey LINE_WIDTH = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-line-width", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The bar style for bar charts (bar, cylinder, stacked, etc.)
   */
  public static final StyleKey BAR_STYLE = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-bar-style", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The area chart style for area charts (basic, stacked, xy, etc.)
   */
  public static final StyleKey AREA_STYLE = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-area-style", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * Bar width specified in terms of percentage
   */
  public static final StyleKey BAR_MAX_WIDTH = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-bar-max-width", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The Drill-Through URL
   */
  public static final StyleKey DRILL_URL = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-drill-url-template", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The axis type dimention (auto, range, domain)
   */
  public static final StyleKey AXIS_DIMENSION = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-type-dimension", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The axis position (primary, secondary)
   */
  public static final StyleKey AXIS_POSITION = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-type-position", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The axis order (1, 2)
   */
  public static final StyleKey AXIS_ORDER = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-type-order", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * Controls whether item label is visible or not
   */
  public static final StyleKey ITEM_LABEL_VISIBLE = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-item-label-visible", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The label text with it's formatting information
   */
  public static final StyleKey ITEM_LABEL_TEXT = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-item-label-text", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The gradient type (for eg: none, VERTICAL, CENTER_VERTICAL, HORIZONTAL, CENTER_HORIZONTAL, POINTS)
   */
  public static final StyleKey GRADIENT_TYPE = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-gradient-type", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The gradient color style
   */
  public static final StyleKey GRADIENT_COLOR = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-gradient-color", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$
  
  /**
   * The gradient start position indicator (for eg: 1,1)
   */
  public static final StyleKey GRADIENT_START = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-gradient-start", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$
  
  /**
   * The gradient end position indicator (eg: 12,10)
   */
  public static final StyleKey GRADIENT_END = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-gradient-end", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$
  
  /**
   * A css color
   */
  public static final StyleKey CSS_COLOR = StyleKeyRegistry.getRegistry().
      createKey("color", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The scale for the plot for eg: a scale of 1000 means data will be divided by 1000
   */
  public static final StyleKey SCALE_NUM = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-scale", false, true, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The category margin for the axis
   */
  public static final StyleKey MARGIN_CATEGORY = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-category-margin", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$
 
  /**
   * The lower margin for the axis
   */
  public static final StyleKey MARGIN_LOWER = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-lower-margin", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The upper Margin for the axis
   */
  public static final StyleKey MARGIN_UPPER = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-upper-margin", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * The item margin for the axis
   */
  public static final StyleKey MARGIN_ITEM = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-item-margin", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  /**
   * Axis location (primary/secondary)
   */
  public static final StyleKey AXIS_LOCATION = StyleKeyRegistry.getRegistry().
      createKey("-x-pentaho-chart-axis-location", false, false, StyleKey.All_ELEMENTS); //$NON-NLS-1$

  private ChartStyleKeys() {
  }
}

