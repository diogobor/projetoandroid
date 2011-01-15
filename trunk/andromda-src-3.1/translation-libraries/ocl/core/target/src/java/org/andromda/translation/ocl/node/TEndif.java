/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TEndif extends Token
{
    public TEndif()
    {
        super.setText("endif");
    }

    public TEndif(int line, int pos)
    {
        super.setText("endif");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TEndif(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndif(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TEndif text.");
    }
}