/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TGteq extends Token
{
    public TGteq()
    {
        super.setText(">=");
    }

    public TGteq(int line, int pos)
    {
        super.setText(">=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TGteq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGteq(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TGteq text.");
    }
}
