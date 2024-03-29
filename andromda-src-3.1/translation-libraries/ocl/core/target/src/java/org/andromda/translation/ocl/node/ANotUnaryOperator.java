/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ANotUnaryOperator extends PUnaryOperator
{
    private TNot _not_;

    public ANotUnaryOperator()
    {
    }

    public ANotUnaryOperator(
        TNot _not_)
    {
        setNot(_not_);

    }
    public Object clone()
    {
        return new ANotUnaryOperator(
            (TNot) cloneNode(_not_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotUnaryOperator(this);
    }

    public TNot getNot()
    {
        return _not_;
    }

    public void setNot(TNot node)
    {
        if(_not_ != null)
        {
            _not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _not_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_not_);
    }

    void removeChild(Node child)
    {
        if(_not_ == child)
        {
            _not_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

    }
}
