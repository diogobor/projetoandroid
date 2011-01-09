/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class TApostrophe extends Token
{
    public TApostrophe()
    {
        super.setText("\'");
    }

    public TApostrophe(int line, int pos)
    {
        super.setText("\'");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TApostrophe(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTApostrophe(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TApostrophe text.");
    }
}
