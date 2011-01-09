/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AInLetExpSub extends PLetExpSub
{
    private TIn _in_;
    private PLogicalExp _logicalExp_;

    public AInLetExpSub()
    {
    }

    public AInLetExpSub(
        TIn _in_,
        PLogicalExp _logicalExp_)
    {
        setIn(_in_);

        setLogicalExp(_logicalExp_);

    }
    public Object clone()
    {
        return new AInLetExpSub(
            (TIn) cloneNode(_in_),
            (PLogicalExp) cloneNode(_logicalExp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInLetExpSub(this);
    }

    public TIn getIn()
    {
        return _in_;
    }

    public void setIn(TIn node)
    {
        if(_in_ != null)
        {
            _in_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _in_ = node;
    }

    public PLogicalExp getLogicalExp()
    {
        return _logicalExp_;
    }

    public void setLogicalExp(PLogicalExp node)
    {
        if(_logicalExp_ != null)
        {
            _logicalExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _logicalExp_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_in_)
            + toString(_logicalExp_);
    }

    void removeChild(Node child)
    {
        if(_in_ == child)
        {
            _in_ = null;
            return;
        }

        if(_logicalExp_ == child)
        {
            _logicalExp_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_in_ == oldChild)
        {
            setIn((TIn) newChild);
            return;
        }

        if(_logicalExp_ == oldChild)
        {
            setLogicalExp((PLogicalExp) newChild);
            return;
        }

    }
}
