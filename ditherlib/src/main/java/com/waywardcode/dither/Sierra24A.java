/*
 * Copyright Richard Todd. I put the code under the
 * GPL v2.0.  See the LICENSE file in the repository.
 * for more information.
 */
package com.waywardcode.dither;

import com.waywardcode.dither.colors.ColorSelector;

/**
 *
 * @author richa
 */
public class Sierra24A extends ErrDiffusionDither {

    public Sierra24A(ColorSelector cs) {
        super(cs, 
              new double[][] { { 2 }, { 1, 1 } }, 
              4, 
              1);
    }
    
    @Override public String toString() { return "Sierra Lite 2-4A"; }        
}
