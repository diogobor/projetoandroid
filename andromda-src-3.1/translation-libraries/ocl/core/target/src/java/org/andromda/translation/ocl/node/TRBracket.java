/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TRBracket extends Token
{
    public TRBracket()
    {
        super.setText("]");
    }

    public TRBracket(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TRBracket(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRBracket(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TRBracket text.");
    }
}
