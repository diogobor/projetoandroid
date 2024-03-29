/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TInit extends Token
{
    public TInit()
    {
        super.setText("init");
    }

    public TInit(int line, int pos)
    {
        super.setText("init");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TInit(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInit(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TInit text.");
    }
}
