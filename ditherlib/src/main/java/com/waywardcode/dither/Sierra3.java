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
public class Sierra3 extends ErrDiffusionDither {

    public Sierra3(ColorSelector cs) {
        super(cs, 
              new double[][] { { 5, 3 }, { 2, 4, 5, 4, 2 }, { 0, 2, 3, 2 } }, 
              32, 
              2);
    }
    
    @Override public String toString() { return "Sierra-3"; }        
}
