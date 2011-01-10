/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ARelationalExpressionTail extends PRelationalExpressionTail
{
    private PRelationalOperator _relationalOperator_;
    private PAdditiveExpression _additiveExpression_;

    public ARelationalExpressionTail()
    {
    }

    public ARelationalExpressionTail(
        PRelationalOperator _relationalOperator_,
        PAdditiveExpression _additiveExpression_)
    {
        setRelationalOperator(_relationalOperator_);

        setAdditiveExpression(_additiveExpression_);

    }
    public Object clone()
    {
        return new ARelationalExpressionTail(
            (PRelationalOperator) cloneNode(_relationalOperator_),
            (PAdditiveExpression) cloneNode(_additiveExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARelationalExpressionTail(this);
    }

    public PRelationalOperator getRelationalOperator()
    {
        return _relationalOperator_;
    }

    public void setRelationalOperator(PRelationalOperator node)
    {
        if(_relationalOperator_ != null)
        {
            _relationalOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _relationalOperator_ = node;
    }

    public PAdditiveExpression getAdditiveExpression()
    {
        return _additiveExpression_;
    }

    public void setAdditiveExpression(PAdditiveExpression node)
    {
        if(_additiveExpression_ != null)
        {
            _additiveExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _additiveExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_relationalOperator_)
            + toString(_additiveExpression_);
    }

    void removeChild(Node child)
    {
        if(_relationalOperator_ == child)
        {
            _relationalOperator_ = null;
            return;
        }

        if(_additiveExpression_ == child)
        {
            _additiveExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_relationalOperator_ == oldChild)
        {
            setRelationalOperator((PRelationalOperator) newChild);
            return;
        }

        if(_additiveExpression_ == oldChild)
        {
            setAdditiveExpression((PAdditiveExpression) newChild);
            return;
        }

    }
}