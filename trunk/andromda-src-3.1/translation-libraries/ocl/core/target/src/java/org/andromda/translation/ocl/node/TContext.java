/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TContext extends Token
{
    public TContext()
    {
        super.setText("context");
    }

    public TContext(int line, int pos)
    {
        super.setText("context");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TContext(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTContext(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TContext text.");
    }
}