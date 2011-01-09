/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AUnaryExpression extends PUnaryExpression
{
    private PUnaryOperator _unaryOperator_;
    private PPropertyCallExpression _propertyCallExpression_;

    public AUnaryExpression()
    {
    }

    public AUnaryExpression(
        PUnaryOperator _unaryOperator_,
        PPropertyCallExpression _propertyCallExpression_)
    {
        setUnaryOperator(_unaryOperator_);

        setPropertyCallExpression(_propertyCallExpression_);

    }
    public Object clone()
    {
        return new AUnaryExpression(
            (PUnaryOperator) cloneNode(_unaryOperator_),
            (PPropertyCallExpression) cloneNode(_propertyCallExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnaryExpression(this);
    }

    public PUnaryOperator getUnaryOperator()
    {
        return _unaryOperator_;
    }

    public void setUnaryOperator(PUnaryOperator node)
    {
        if(_unaryOperator_ != null)
        {
            _unaryOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unaryOperator_ = node;
    }

    public PPropertyCallExpression getPropertyCallExpression()
    {
        return _propertyCallExpression_;
    }

    public void setPropertyCallExpression(PPropertyCallExpression node)
    {
        if(_propertyCallExpression_ != null)
        {
            _propertyCallExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _propertyCallExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unaryOperator_)
            + toString(_propertyCallExpression_);
    }

    void removeChild(Node child)
    {
        if(_unaryOperator_ == child)
        {
            _unaryOperator_ = null;
            return;
        }

        if(_propertyCallExpression_ == child)
        {
            _propertyCallExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unaryOperator_ == oldChild)
        {
            setUnaryOperator((PUnaryOperator) newChild);
            return;
        }

        if(_propertyCallExpression_ == oldChild)
        {
            setPropertyCallExpression((PPropertyCallExpression) newChild);
            return;
        }

    }
}
