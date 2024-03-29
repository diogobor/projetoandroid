/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TDef extends Token
{
    public TDef()
    {
        super.setText("def");
    }

    public TDef(int line, int pos)
    {
        super.setText("def");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TDef(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDef(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TDef text.");
    }
}
