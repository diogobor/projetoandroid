/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AIfPrimaryExpression extends PPrimaryExpression
{
    private PIfExpression _ifExpression_;

    public AIfPrimaryExpression()
    {
    }

    public AIfPrimaryExpression(
        PIfExpression _ifExpression_)
    {
        setIfExpression(_ifExpression_);

    }
    public Object clone()
    {
        return new AIfPrimaryExpression(
            (PIfExpression) cloneNode(_ifExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfPrimaryExpression(this);
    }

    public PIfExpression getIfExpression()
    {
        return _ifExpression_;
    }

    public void setIfExpression(PIfExpression node)
    {
        if(_ifExpression_ != null)
        {
            _ifExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ifExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_ifExpression_);
    }

    void removeChild(Node child)
    {
        if(_ifExpression_ == child)
        {
            _ifExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_ifExpression_ == oldChild)
        {
            setIfExpression((PIfExpression) newChild);
            return;
        }

    }
}