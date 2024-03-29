/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class APrimitiveLiteral extends PLiteral
{
    private PPrimitiveLit _primitiveLit_;

    public APrimitiveLiteral()
    {
    }

    public APrimitiveLiteral(
        PPrimitiveLit _primitiveLit_)
    {
        setPrimitiveLit(_primitiveLit_);

    }
    public Object clone()
    {
        return new APrimitiveLiteral(
            (PPrimitiveLit) cloneNode(_primitiveLit_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrimitiveLiteral(this);
    }

    public PPrimitiveLit getPrimitiveLit()
    {
        return _primitiveLit_;
    }

    public void setPrimitiveLit(PPrimitiveLit node)
    {
        if(_primitiveLit_ != null)
        {
            _primitiveLit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _primitiveLit_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_primitiveLit_);
    }

    void removeChild(Node child)
    {
        if(_primitiveLit_ == child)
        {
            _primitiveLit_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_primitiveLit_ == oldChild)
        {
            setPrimitiveLit((PPrimitiveLit) newChild);
            return;
        }

    }
}
