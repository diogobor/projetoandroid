/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2POperationExpressionBody extends XPOperationExpressionBody
{
    private POperationExpressionBody _pOperationExpressionBody_;

    public X2POperationExpressionBody()
    {
    }

    public X2POperationExpressionBody(
        POperationExpressionBody _pOperationExpressionBody_)
    {
        setPOperationExpressionBody(_pOperationExpressionBody_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public POperationExpressionBody getPOperationExpressionBody()
    {
        return _pOperationExpressionBody_;
    }

    public void setPOperationExpressionBody(POperationExpressionBody node)
    {
        if(_pOperationExpressionBody_ != null)
        {
            _pOperationExpressionBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pOperationExpressionBody_ = node;
    }

    void removeChild(Node child)
    {
        if(_pOperationExpressionBody_ == child)
        {
            _pOperationExpressionBody_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pOperationExpressionBody_);
    }
}
