/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AInvClassifierExpressionBody extends PClassifierExpressionBody
{
    private TInv _inv_;
    private TName _name_;
    private TColon _colon_;
    private PExpression _expression_;

    public AInvClassifierExpressionBody()
    {
    }

    public AInvClassifierExpressionBody(
        TInv _inv_,
        TName _name_,
        TColon _colon_,
        PExpression _expression_)
    {
        setInv(_inv_);

        setName(_name_);

        setColon(_colon_);

        setExpression(_expression_);

    }
    public Object clone()
    {
        return new AInvClassifierExpressionBody(
            (TInv) cloneNode(_inv_),
            (TName) cloneNode(_name_),
            (TColon) cloneNode(_colon_),
            (PExpression) cloneNode(_expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInvClassifierExpressionBody(this);
    }

    public TInv getInv()
    {
        return _inv_;
    }

    public void setInv(TInv node)
    {
        if(_inv_ != null)
        {
            _inv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _inv_ = node;
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

    public TColon getColon()
    {
        return _colon_;
    }

    public void setColon(TColon node)
    {
        if(_colon_ != null)
        {
            _colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _colon_ = node;
    }

    public PExpression getExpression()
    {
        return _expression_;
    }

    public void setExpression(PExpression node)
    {
        if(_expression_ != null)
        {
            _expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_inv_)
            + toString(_name_)
            + toString(_colon_)
            + toString(_expression_);
    }

    void removeChild(Node child)
    {
        if(_inv_ == child)
        {
            _inv_ = null;
            return;
        }

        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

        if(_colon_ == child)
        {
            _colon_ = null;
            return;
        }

        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_inv_ == oldChild)
        {
            setInv((TInv) newChild);
            return;
        }

        if(_name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

        if(_colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

    }
}
