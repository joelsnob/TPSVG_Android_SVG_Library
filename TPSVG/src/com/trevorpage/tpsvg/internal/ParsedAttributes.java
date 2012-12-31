package com.trevorpage.tpsvg.internal;

import com.trevorpage.tpsvg.SVGParserRenderer.SvgStyle;

public class ParsedAttributes {
	
	public float x;
	public float y;
	
	public float x1;
	public float y1;
	public float x2;
	public float y2;
	public float cx;
	public float cy;
	
	public float radius;
	public float width;
	public float height;
	
	public String pathData;
	public String transformData;
	public String styleData;
	public String pointsData;
	public SvgStyle svgStyle;

	public String id;
	public String xlink_href;
	
	public String viewBox;
	
	public boolean anchorRight;
	public boolean anchorBottom;
	
	public boolean stretchToExcessWidth;
	public boolean stretchToExcessHeight;
	
	public ParsedAttributes() {
    	transformData = null;
    	styleData = null;
    	id = "";
    	anchorRight = false;
    	anchorBottom = false;
    	stretchToExcessWidth = false;
    	stretchToExcessHeight = false;
	}
}