/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TEqual extends Token
{
    public TEqual()
    {
        super.setText("=");
    }

    public TEqual(int line, int pos)
    {
        super.setText("=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TEqual(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEqual(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TEqual text.");
    }
}
