/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AOperationDefinitionExpression extends PDefinitionExpression
{
    private POperation _operation_;
    private TEqual _equal_;
    private PExpression _expression_;

    public AOperationDefinitionExpression()
    {
    }

    public AOperationDefinitionExpression(
        POperation _operation_,
        TEqual _equal_,
        PExpression _expression_)
    {
        setOperation(_operation_);

        setEqual(_equal_);

        setExpression(_expression_);

    }
    public Object clone()
    {
        return new AOperationDefinitionExpression(
            (POperation) cloneNode(_operation_),
            (TEqual) cloneNode(_equal_),
            (PExpression) cloneNode(_expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOperationDefinitionExpression(this);
    }

    public POperation getOperation()
    {
        return _operation_;
    }

    public void setOperation(POperation node)
    {
        if(_operation_ != null)
        {
            _operation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _operation_ = node;
    }

    public TEqual getEqual()
    {
        return _equal_;
    }

    public void setEqual(TEqual node)
    {
        if(_equal_ != null)
        {
            _equal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _equal_ = node;
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
            + toString(_operation_)
            + toString(_equal_)
            + toString(_expression_);
    }

    void removeChild(Node child)
    {
        if(_operation_ == child)
        {
            _operation_ = null;
            return;
        }

        if(_equal_ == child)
        {
            _equal_ = null;
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
        if(_operation_ == oldChild)
        {
            setOperation((POperation) newChild);
            return;
        }

        if(_equal_ == oldChild)
        {
            setEqual((TEqual) newChild);
            return;
        }

        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

    }
}
