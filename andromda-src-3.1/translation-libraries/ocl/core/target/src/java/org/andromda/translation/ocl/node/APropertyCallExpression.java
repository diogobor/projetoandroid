/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class APropertyCallExpression extends PPropertyCallExpression
{
    private PPrimaryExpression _primaryExpression_;
    private final LinkedList _propertyCallExpressionTail_ = new TypedLinkedList(new PropertyCallExpressionTail_Cast());

    public APropertyCallExpression()
    {
    }

    public APropertyCallExpression(
        PPrimaryExpression _primaryExpression_,
        List _propertyCallExpressionTail_)
    {
        setPrimaryExpression(_primaryExpression_);

        {
            this._propertyCallExpressionTail_.clear();
            this._propertyCallExpressionTail_.addAll(_propertyCallExpressionTail_);
        }

    }

    public APropertyCallExpression(
        PPrimaryExpression _primaryExpression_,
        XPPropertyCallExpressionTail _propertyCallExpressionTail_)
    {
        setPrimaryExpression(_primaryExpression_);

        if(_propertyCallExpressionTail_ != null)
        {
            while(_propertyCallExpressionTail_ instanceof X1PPropertyCallExpressionTail)
            {
                this._propertyCallExpressionTail_.addFirst(((X1PPropertyCallExpressionTail) _propertyCallExpressionTail_).getPPropertyCallExpressionTail());
                _propertyCallExpressionTail_ = ((X1PPropertyCallExpressionTail) _propertyCallExpressionTail_).getXPPropertyCallExpressionTail();
            }
            this._propertyCallExpressionTail_.addFirst(((X2PPropertyCallExpressionTail) _propertyCallExpressionTail_).getPPropertyCallExpressionTail());
        }

    }
    public Object clone()
    {
        return new APropertyCallExpression(
            (PPrimaryExpression) cloneNode(_primaryExpression_),
            cloneList(_propertyCallExpressionTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPropertyCallExpression(this);
    }

    public PPrimaryExpression getPrimaryExpression()
    {
        return _primaryExpression_;
    }

    public void setPrimaryExpression(PPrimaryExpression node)
    {
        if(_primaryExpression_ != null)
        {
            _primaryExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _primaryExpression_ = node;
    }

    public LinkedList getPropertyCallExpressionTail()
    {
        return _propertyCallExpressionTail_;
    }

    public void setPropertyCallExpressionTail(List list)
    {
        _propertyCallExpressionTail_.clear();
        _propertyCallExpressionTail_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_primaryExpression_)
            + toString(_propertyCallExpressionTail_);
    }

    void removeChild(Node child)
    {
        if(_primaryExpression_ == child)
        {
            _primaryExpression_ = null;
            return;
        }

        if(_propertyCallExpressionTail_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_primaryExpression_ == oldChild)
        {
            setPrimaryExpression((PPrimaryExpression) newChild);
            return;
        }

        for(ListIterator i = _propertyCallExpressionTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class PropertyCallExpressionTail_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PPropertyCallExpressionTail node = (PPropertyCallExpressionTail) o;

            if((node.parent() != null) &&
                (node.parent() != APropertyCallExpression.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != APropertyCallExpression.this))
            {
                node.parent(APropertyCallExpression.this);
            }

            return node;
        }
    }
}
