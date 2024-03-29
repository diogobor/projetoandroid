/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TSet extends Token
{
    public TSet(String text)
    {
        setText(text);
    }

    public TSet(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TSet(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSet(this);
    }
}
