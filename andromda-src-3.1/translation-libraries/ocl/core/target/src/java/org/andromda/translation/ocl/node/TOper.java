/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TOper extends Token
{
    public TOper()
    {
        super.setText("oper");
    }

    public TOper(int line, int pos)
    {
        super.setText("oper");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TOper(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOper(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TOper text.");
    }
}
