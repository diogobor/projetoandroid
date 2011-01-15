/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ADeriveInitialOrDerivedValue extends PInitialOrDerivedValue
{
    private TDerive _derive_;
    private TColon _colon_;
    private PExpression _expression_;
    private PInitialOrDerivedValue _initialOrDerivedValue_;

    public ADeriveInitialOrDerivedValue()
    {
    }

    public ADeriveInitialOrDerivedValue(
        TDerive _derive_,
        TColon _colon_,
        PExpression _expression_,
        PInitialOrDerivedValue _initialOrDerivedValue_)
    {
        setDerive(_derive_);

        setColon(_colon_);

        setExpression(_expression_);

        setInitialOrDerivedValue(_initialOrDerivedValue_);

    }
    public Object clone()
    {
        return new ADeriveInitialOrDerivedValue(
            (TDerive) cloneNode(_derive_),
            (TColon) cloneNode(_colon_),
            (PExpression) cloneNode(_expression_),
            (PInitialOrDerivedValue) cloneNode(_initialOrDerivedValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeriveInitialOrDerivedValue(this);
    }

    public TDerive getDerive()
    {
        return _derive_;
    }

    public void setDerive(TDerive node)
    {
        if(_derive_ != null)
        {
            _derive_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _derive_ = node;
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

    public PInitialOrDerivedValue getInitialOrDerivedValue()
    {
        return _initialOrDerivedValue_;
    }

    public void setInitialOrDerivedValue(PInitialOrDerivedValue node)
    {
        if(_initialOrDerivedValue_ != null)
        {
            _initialOrDerivedValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _initialOrDerivedValue_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_derive_)
            + toString(_colon_)
            + toString(_expression_)
            + toString(_initialOrDerivedValue_);
    }

    void removeChild(Node child)
    {
        if(_derive_ == child)
        {
            _derive_ = null;
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

        if(_initialOrDerivedValue_ == child)
        {
            _initialOrDerivedValue_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_derive_ == oldChild)
        {
            setDerive((TDerive) newChild);
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

        if(_initialOrDerivedValue_ == oldChild)
        {
            setInitialOrDerivedValue((PInitialOrDerivedValue) newChild);
            return;
        }

    }
}