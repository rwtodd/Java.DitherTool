/*
 * Copyright Richard Todd. I put the code under the
 * GPL v2.0.  See the LICENSE file in the repository.
 * for more information.
 */
package com.waywardcode.dither.colors;

import javafx.scene.paint.Color;

/**
 * An enumeration of the common palette options one might want to use.
 * @author Richard Todd
 */
public enum StandardPalette {
    /**
     * Black-and-White
     */
    MONO("Monochrome B/W",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0xFF, 0xFF, 0xFF)),
    /**
     * Gray-Scale (4 colors).
     */
    GRAY4("Gray 4-Color",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x55, 0x55, 0x55),
            Color.rgb(0xAA, 0xAA, 0xAA),
            Color.rgb(0xFF, 0xFF, 0xFF)),
    /**
     * Gray-Scale (16 colors).
     */
    GRAY16("Gray 16-Color",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x11, 0x11, 0x11),
            Color.rgb(0x22, 0x22, 0x22),
            Color.rgb(0x33, 0x33, 0x33),
            Color.rgb(0x44, 0x44, 0x44),
            Color.rgb(0x55, 0x55, 0x55),
            Color.rgb(0x66, 0x66, 0x66),
            Color.rgb(0x77, 0x77, 0x77),
            Color.rgb(0x88, 0x88, 0x88),
            Color.rgb(0x99, 0x99, 0x99),
            Color.rgb(0xAA, 0xAA, 0xAA),
            Color.rgb(0xBB, 0xBB, 0xBB),
            Color.rgb(0xCC, 0xCC, 0xCC),
            Color.rgb(0xDD, 0xDD, 0xDD),
            Color.rgb(0xEE, 0xEE, 0xEE),
            Color.rgb(0xFF, 0xFF, 0xFF)),
   
    /** 
     * CGA Mode 1, Low intensity. Cyan, Magenta, White.
     */
    CGA1("CGA Mode 1 Dark",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x00, 0xAA, 0xAA),
            Color.rgb(0xAA, 0x00, 0xAA),
            Color.rgb(0xAA, 0xAA, 0xAA)),
    /**
     * CGA Mode 1, High intensity. Cyan, Magenta, White.
     */
    CGA1H("CGA Mode 1 Bright",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x55, 0xFF, 0xFF),
            Color.rgb(0xFF, 0x55, 0xFF),
            Color.rgb(0xFF, 0xFF, 0xFF)),
    /**
     * CGA Mode 0, Low intensity. Green, Red, Brown.
     */
    CGA0("CGA Mode 0 Dark",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0xAA, 0x00, 0x00),
            Color.rgb(0x00, 0xAA, 0x00),
            Color.rgb(0xAA, 0x55, 0x00)),
    /**
     * CGA Mode 0, High intensity. Green, Red, Yellow.
     */
    CGA0H("CGA Mode 0 Bright",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x55, 0xFF, 0x55),
            Color.rgb(0xFF, 0x55, 0x55),
            Color.rgb(0xFF, 0xFF, 0x55)),
    /**
     * EGA 16 Colors.
     */
    EGA("EGA 16-Color",
            Color.rgb(0x00, 0x00, 0x00), // 0
            Color.rgb(0x00, 0x00, 0xAA), // 1
            Color.rgb(0x00, 0xAA, 0x00), // 2
            Color.rgb(0x00, 0xAA, 0xAA), // 3
            Color.rgb(0xAA, 0x00, 0x00), // 4
            Color.rgb(0xAA, 0x00, 0xAA), // 5
            Color.rgb(0xAA, 0x55, 0x00), // 6
            Color.rgb(0xAA, 0xAA, 0xAA), // 7
            Color.rgb(0x55, 0x55, 0x55), // 8
            Color.rgb(0x55, 0x55, 0xFF), // 9
            Color.rgb(0x55, 0xFF, 0x55), // 10
            Color.rgb(0x55, 0xFF, 0xFF), // 11
            Color.rgb(0xFF, 0x55, 0x55), // 12
            Color.rgb(0xFF, 0x55, 0xFF), // 13
            Color.rgb(0xFF, 0xFF, 0x55), // 14
            Color.rgb(0xFF, 0xFF, 0xFF)), // 15
    /**
     * The default VGA 256 color palette, which actually only has 244 colors in it.
     */
    VGA("VGA 256-Color",
            Color.rgb(0x00, 0x00, 0x00),
            Color.rgb(0x00, 0x00, 0x41),
            Color.rgb(0x00, 0x00, 0x71),
            Color.rgb(0x00, 0x00, 0xAA),
            Color.rgb(0x00, 0x00, 0xFF),
            Color.rgb(0x00, 0x10, 0x41),
            Color.rgb(0x00, 0x1C, 0x71),
            Color.rgb(0x00, 0x20, 0x41),
            Color.rgb(0x00, 0x31, 0x41),
            Color.rgb(0x00, 0x39, 0x71),
            Color.rgb(0x00, 0x41, 0x00),
            Color.rgb(0x00, 0x41, 0x10),
            Color.rgb(0x00, 0x41, 0x20),
            Color.rgb(0x00, 0x41, 0x31),
            Color.rgb(0x00, 0x41, 0x41),
            Color.rgb(0x00, 0x41, 0xFF),
            Color.rgb(0x00, 0x55, 0x71),
            Color.rgb(0x00, 0x71, 0x00),
            Color.rgb(0x00, 0x71, 0x1C),
            Color.rgb(0x00, 0x71, 0x39),
            Color.rgb(0x00, 0x71, 0x55),
            Color.rgb(0x00, 0x71, 0x71),
            Color.rgb(0x00, 0x82, 0xFF),
            Color.rgb(0x00, 0xAA, 0x00),
            Color.rgb(0x00, 0xAA, 0xAA),
            Color.rgb(0x00, 0xBE, 0xFF),
            Color.rgb(0x00, 0xFF, 0x00),
            Color.rgb(0x00, 0xFF, 0x41),
            Color.rgb(0x00, 0xFF, 0x82),
            Color.rgb(0x00, 0xFF, 0xBE),
            Color.rgb(0x00, 0xFF, 0xFF),
            Color.rgb(0x10, 0x00, 0x41),
            Color.rgb(0x10, 0x10, 0x10),
            Color.rgb(0x10, 0x41, 0x00),
            Color.rgb(0x1C, 0x00, 0x71),
            Color.rgb(0x1C, 0x71, 0x00),
            Color.rgb(0x20, 0x00, 0x41),
            Color.rgb(0x20, 0x20, 0x20),
            Color.rgb(0x20, 0x20, 0x41),
            Color.rgb(0x20, 0x28, 0x41),
            Color.rgb(0x20, 0x31, 0x41),
            Color.rgb(0x20, 0x39, 0x41),
            Color.rgb(0x20, 0x41, 0x00),
            Color.rgb(0x20, 0x41, 0x20),
            Color.rgb(0x20, 0x41, 0x28),
            Color.rgb(0x20, 0x41, 0x31),
            Color.rgb(0x20, 0x41, 0x39),
            Color.rgb(0x20, 0x41, 0x41),
            Color.rgb(0x28, 0x20, 0x41),
            Color.rgb(0x28, 0x41, 0x20),
            Color.rgb(0x2D, 0x2D, 0x41),
            Color.rgb(0x2D, 0x31, 0x41),
            Color.rgb(0x2D, 0x35, 0x41),
            Color.rgb(0x2D, 0x3D, 0x41),
            Color.rgb(0x2D, 0x41, 0x2D),
            Color.rgb(0x2D, 0x41, 0x31),
            Color.rgb(0x2D, 0x41, 0x35),
            Color.rgb(0x2D, 0x41, 0x3D),
            Color.rgb(0x2D, 0x41, 0x41),
            Color.rgb(0x31, 0x00, 0x41),
            Color.rgb(0x31, 0x20, 0x41),
            Color.rgb(0x31, 0x2D, 0x41),
            Color.rgb(0x31, 0x41, 0x00),
            Color.rgb(0x31, 0x41, 0x20),
            Color.rgb(0x31, 0x41, 0x2D),
            Color.rgb(0x35, 0x2D, 0x41),
            Color.rgb(0x35, 0x35, 0x35),
            Color.rgb(0x35, 0x41, 0x2D),
            Color.rgb(0x39, 0x00, 0x71),
            Color.rgb(0x39, 0x20, 0x41),
            Color.rgb(0x39, 0x39, 0x71),
            Color.rgb(0x39, 0x41, 0x20),
            Color.rgb(0x39, 0x45, 0x71),
            Color.rgb(0x39, 0x55, 0x71),
            Color.rgb(0x39, 0x61, 0x71),
            Color.rgb(0x39, 0x71, 0x00),
            Color.rgb(0x39, 0x71, 0x39),
            Color.rgb(0x39, 0x71, 0x45),
            Color.rgb(0x39, 0x71, 0x55),
            Color.rgb(0x39, 0x71, 0x61),
            Color.rgb(0x39, 0x71, 0x71),
            Color.rgb(0x3D, 0x2D, 0x41),
            Color.rgb(0x3D, 0x41, 0x2D),
            Color.rgb(0x41, 0x00, 0x00),
            Color.rgb(0x41, 0x00, 0x10),
            Color.rgb(0x41, 0x00, 0x20),
            Color.rgb(0x41, 0x00, 0x31),
            Color.rgb(0x41, 0x00, 0x41),
            Color.rgb(0x41, 0x00, 0xFF),
            Color.rgb(0x41, 0x10, 0x00),
            Color.rgb(0x41, 0x20, 0x00),
            Color.rgb(0x41, 0x20, 0x20),
            Color.rgb(0x41, 0x20, 0x28),
            Color.rgb(0x41, 0x20, 0x31),
            Color.rgb(0x41, 0x20, 0x39),
            Color.rgb(0x41, 0x20, 0x41),
            Color.rgb(0x41, 0x28, 0x20),
            Color.rgb(0x41, 0x2D, 0x2D),
            Color.rgb(0x41, 0x2D, 0x31),
            Color.rgb(0x41, 0x2D, 0x35),
            Color.rgb(0x41, 0x2D, 0x3D),
            Color.rgb(0x41, 0x2D, 0x41),
            Color.rgb(0x41, 0x31, 0x00),
            Color.rgb(0x41, 0x31, 0x20),
            Color.rgb(0x41, 0x31, 0x2D),
            Color.rgb(0x41, 0x35, 0x2D),
            Color.rgb(0x41, 0x39, 0x20),
            Color.rgb(0x41, 0x3D, 0x2D),
            Color.rgb(0x41, 0x41, 0x00),
            Color.rgb(0x41, 0x41, 0x20),
            Color.rgb(0x41, 0x41, 0x2D),
            Color.rgb(0x41, 0xFF, 0x00),
            Color.rgb(0x45, 0x39, 0x71),
            Color.rgb(0x45, 0x45, 0x45),
            Color.rgb(0x45, 0x71, 0x39),
            Color.rgb(0x51, 0x51, 0x71),
            Color.rgb(0x51, 0x59, 0x71),
            Color.rgb(0x51, 0x61, 0x71),
            Color.rgb(0x51, 0x69, 0x71),
            Color.rgb(0x51, 0x71, 0x51),
            Color.rgb(0x51, 0x71, 0x59),
            Color.rgb(0x51, 0x71, 0x61),
            Color.rgb(0x51, 0x71, 0x69),
            Color.rgb(0x51, 0x71, 0x71),
            Color.rgb(0x55, 0x00, 0x71),
            Color.rgb(0x55, 0x39, 0x71),
            Color.rgb(0x55, 0x55, 0x55),
            Color.rgb(0x55, 0x55, 0xFF),
            Color.rgb(0x55, 0x71, 0x00),
            Color.rgb(0x55, 0x71, 0x39),
            Color.rgb(0x55, 0xFF, 0x55),
            Color.rgb(0x55, 0xFF, 0xFF),
            Color.rgb(0x59, 0x51, 0x71),
            Color.rgb(0x59, 0x71, 0x51),
            Color.rgb(0x61, 0x39, 0x71),
            Color.rgb(0x61, 0x51, 0x71),
            Color.rgb(0x61, 0x71, 0x39),
            Color.rgb(0x61, 0x71, 0x51),
            Color.rgb(0x65, 0x65, 0x65),
            Color.rgb(0x69, 0x51, 0x71),
            Color.rgb(0x69, 0x71, 0x51),
            Color.rgb(0x71, 0x00, 0x00),
            Color.rgb(0x71, 0x00, 0x1C),
            Color.rgb(0x71, 0x00, 0x39),
            Color.rgb(0x71, 0x00, 0x55),
            Color.rgb(0x71, 0x00, 0x71),
            Color.rgb(0x71, 0x1C, 0x00),
            Color.rgb(0x71, 0x39, 0x00),
            Color.rgb(0x71, 0x39, 0x39),
            Color.rgb(0x71, 0x39, 0x45),
            Color.rgb(0x71, 0x39, 0x55),
            Color.rgb(0x71, 0x39, 0x61),
            Color.rgb(0x71, 0x39, 0x71),
            Color.rgb(0x71, 0x45, 0x39),
            Color.rgb(0x71, 0x51, 0x51),
            Color.rgb(0x71, 0x51, 0x59),
            Color.rgb(0x71, 0x51, 0x61),
            Color.rgb(0x71, 0x51, 0x69),
            Color.rgb(0x71, 0x51, 0x71),
            Color.rgb(0x71, 0x55, 0x00),
            Color.rgb(0x71, 0x55, 0x39),
            Color.rgb(0x71, 0x59, 0x51),
            Color.rgb(0x71, 0x61, 0x39),
            Color.rgb(0x71, 0x61, 0x51),
            Color.rgb(0x71, 0x69, 0x51),
            Color.rgb(0x71, 0x71, 0x00),
            Color.rgb(0x71, 0x71, 0x39),
            Color.rgb(0x71, 0x71, 0x51),
            Color.rgb(0x75, 0x75, 0x75),
            Color.rgb(0x82, 0x00, 0xFF),
            Color.rgb(0x82, 0x82, 0xFF),
            Color.rgb(0x82, 0x9E, 0xFF),
            Color.rgb(0x82, 0xBE, 0xFF),
            Color.rgb(0x82, 0xDF, 0xFF),
            Color.rgb(0x82, 0xFF, 0x00),
            Color.rgb(0x82, 0xFF, 0x82),
            Color.rgb(0x82, 0xFF, 0x9E),
            Color.rgb(0x82, 0xFF, 0xBE),
            Color.rgb(0x82, 0xFF, 0xDF),
            Color.rgb(0x82, 0xFF, 0xFF),
            Color.rgb(0x8A, 0x8A, 0x8A),
            Color.rgb(0x9A, 0x9A, 0x9A),
            Color.rgb(0x9E, 0x82, 0xFF),
            Color.rgb(0x9E, 0xFF, 0x82),
            Color.rgb(0xAA, 0x00, 0x00),
            Color.rgb(0xAA, 0x00, 0xAA),
            Color.rgb(0xAA, 0x55, 0x00),
            Color.rgb(0xAA, 0xAA, 0xAA),
            Color.rgb(0xBA, 0xBA, 0xBA),
            Color.rgb(0xBA, 0xBA, 0xFF),
            Color.rgb(0xBA, 0xCA, 0xFF),
            Color.rgb(0xBA, 0xDF, 0xFF),
            Color.rgb(0xBA, 0xEF, 0xFF),
            Color.rgb(0xBA, 0xFF, 0xBA),
            Color.rgb(0xBA, 0xFF, 0xCA),
            Color.rgb(0xBA, 0xFF, 0xDF),
            Color.rgb(0xBA, 0xFF, 0xEF),
            Color.rgb(0xBA, 0xFF, 0xFF),
            Color.rgb(0xBE, 0x00, 0xFF),
            Color.rgb(0xBE, 0x82, 0xFF),
            Color.rgb(0xBE, 0xFF, 0x00),
            Color.rgb(0xBE, 0xFF, 0x82),
            Color.rgb(0xCA, 0xBA, 0xFF),
            Color.rgb(0xCA, 0xCA, 0xCA),
            Color.rgb(0xCA, 0xFF, 0xBA),
            Color.rgb(0xDF, 0x82, 0xFF),
            Color.rgb(0xDF, 0xBA, 0xFF),
            Color.rgb(0xDF, 0xDF, 0xDF),
            Color.rgb(0xDF, 0xFF, 0x82),
            Color.rgb(0xDF, 0xFF, 0xBA),
            Color.rgb(0xEF, 0xBA, 0xFF),
            Color.rgb(0xEF, 0xEF, 0xEF),
            Color.rgb(0xEF, 0xFF, 0xBA),
            Color.rgb(0xFF, 0x00, 0x00),
            Color.rgb(0xFF, 0x00, 0x41),
            Color.rgb(0xFF, 0x00, 0x82),
            Color.rgb(0xFF, 0x00, 0xBE),
            Color.rgb(0xFF, 0x00, 0xFF),
            Color.rgb(0xFF, 0x41, 0x00),
            Color.rgb(0xFF, 0x55, 0x55),
            Color.rgb(0xFF, 0x55, 0xFF),
            Color.rgb(0xFF, 0x82, 0x00),
            Color.rgb(0xFF, 0x82, 0x82),
            Color.rgb(0xFF, 0x82, 0x9E),
            Color.rgb(0xFF, 0x82, 0xBE),
            Color.rgb(0xFF, 0x82, 0xDF),
            Color.rgb(0xFF, 0x82, 0xFF),
            Color.rgb(0xFF, 0x9E, 0x82),
            Color.rgb(0xFF, 0xBA, 0xBA),
            Color.rgb(0xFF, 0xBA, 0xCA),
            Color.rgb(0xFF, 0xBA, 0xDF),
            Color.rgb(0xFF, 0xBA, 0xEF),
            Color.rgb(0xFF, 0xBA, 0xFF),
            Color.rgb(0xFF, 0xBE, 0x00),
            Color.rgb(0xFF, 0xBE, 0x82),
            Color.rgb(0xFF, 0xCA, 0xBA),
            Color.rgb(0xFF, 0xDF, 0x82),
            Color.rgb(0xFF, 0xDF, 0xBA),
            Color.rgb(0xFF, 0xEF, 0xBA),
            Color.rgb(0xFF, 0xFF, 0x00),
            Color.rgb(0xFF, 0xFF, 0x55),
            Color.rgb(0xFF, 0xFF, 0x82),
            Color.rgb(0xFF, 0xFF, 0xBA),
            Color.rgb(0xFF, 0xFF, 0xFF)),
    /**
     * The Plan-9 OS palette.
     */
    PLAN9("Plan-9 OS Palette"),
    /**
     * The famous Netscape "web safe" palette.
     */
    WEBSAFE("WebSafe 216-Color");

    private Color[] colors;
    private final String description;
    
    @Override public String toString() { return description; }
    
    // consider switching to an array copy one day to avoid a client possibly 
    // corrupting the color list
    public Color[] getColors() { return colors; }
    
    StandardPalette(String desc, Color... cols) {
        description = desc;
        colors = cols;
                 
        // a few of them are too big so I just generate them on demand.
        if(cols.length == 0) {
            switch(name()) {
                case "PLAN9": genPlan9Colors(); break;
                case "WEBSAFE": genWebSafeColors(); break;       
            }
        }
    }
    
    // derived from the Go standard packages...
    private void genPlan9Colors() {
        colors = new Color[256];
        int idx = 0;
        
        for (int r = 0; r < 4; r++) {
            for (int v = 0; v < 4; v++) {
                for (int g = 0; g < 4; g++) {
                    for (int b = 0; b < 4; b++) {
                        int den = r;
                        if(g > den) { den = g; }
                        if(b > den) { den = b; }
                        if(den == 0) {
                            colors[idx++] = Color.rgb(0x11 * v, 0x11*v, 0x11*v);
                        } else {
                            int num = 17 * (4*den + v);
                            colors[idx++] = Color.rgb(r*num/den, g*num/den, b*num/den);
                        }
                    }
   
                }                
            }
        }
    }
    
    private void genWebSafeColors() {
        colors = new Color[216];
        final int[] options = { 0x00, 0x33, 0x66, 0x99, 0xCC, 0xFF };
        int idx = 0;
        for (int r : options) {
            for (int g : options) {
                for (int b : options) {
                    colors[idx++] = Color.rgb(r,g,b);
                }
            }
        }        
    }
}
