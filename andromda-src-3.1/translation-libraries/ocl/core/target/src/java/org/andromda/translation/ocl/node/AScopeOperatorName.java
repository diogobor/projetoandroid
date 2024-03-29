/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AScopeOperatorName extends PScopeOperatorName
{
    private TScopeOperator _scopeOperator_;
    private TName _name_;

    public AScopeOperatorName()
    {
    }

    public AScopeOperatorName(
        TScopeOperator _scopeOperator_,
        TName _name_)
    {
        setScopeOperator(_scopeOperator_);

        setName(_name_);

    }
    public Object clone()
    {
        return new AScopeOperatorName(
            (TScopeOperator) cloneNode(_scopeOperator_),
            (TName) cloneNode(_name_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAScopeOperatorName(this);
    }

    public TScopeOperator getScopeOperator()
    {
        return _scopeOperator_;
    }

    public void setScopeOperator(TScopeOperator node)
    {
        if(_scopeOperator_ != null)
        {
            _scopeOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _scopeOperator_ = node;
    }

    public TName getName()
    {
        return _name_;
    }

    public void setName(TName node)
    {
        if(_name_ != null)
        {
            _name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _name_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_scopeOperator_)
            + toString(_name_);
    }

    void removeChild(Node child)
    {
        if(_scopeOperator_ == child)
        {
            _scopeOperator_ = null;
            return;
        }

        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_scopeOperator_ == oldChild)
        {
            setScopeOperator((TScopeOperator) newChild);
            return;
        }

        if(_name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

    }
}
