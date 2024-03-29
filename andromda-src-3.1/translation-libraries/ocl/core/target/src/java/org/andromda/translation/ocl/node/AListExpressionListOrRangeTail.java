/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AListExpressionListOrRangeTail extends PExpressionListOrRangeTail
{
    private final LinkedList _commaExpression_ = new TypedLinkedList(new CommaExpression_Cast());

    public AListExpressionListOrRangeTail()
    {
    }

    public AListExpressionListOrRangeTail(
        List _commaExpression_)
    {
        {
            this._commaExpression_.clear();
            this._commaExpression_.addAll(_commaExpression_);
        }

    }

    public AListExpressionListOrRangeTail(
        XPCommaExpression _commaExpression_)
    {
        if(_commaExpression_ != null)
        {
            while(_commaExpression_ instanceof X1PCommaExpression)
            {
                this._commaExpression_.addFirst(((X1PCommaExpression) _commaExpression_).getPCommaExpression());
                _commaExpression_ = ((X1PCommaExpression) _commaExpression_).getXPCommaExpression();
            }
            this._commaExpression_.addFirst(((X2PCommaExpression) _commaExpression_).getPCommaExpression());
        }

    }
    public Object clone()
    {
        return new AListExpressionListOrRangeTail(
            cloneList(_commaExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListExpressionListOrRangeTail(this);
    }

    public LinkedList getCommaExpression()
    {
        return _commaExpression_;
    }

    public void setCommaExpression(List list)
    {
        _commaExpression_.clear();
        _commaExpression_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_commaExpression_);
    }

    void removeChild(Node child)
    {
        if(_commaExpression_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _commaExpression_.listIterator(); i.hasNext();)
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

    private class CommaExpression_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCommaExpression node = (PCommaExpression) o;

            if((node.parent() != null) &&
                (node.parent() != AListExpressionListOrRangeTail.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AListExpressionListOrRangeTail.this))
            {
                node.parent(AListExpressionListOrRangeTail.this);
            }

            return node;
        }
    }
}
