/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PPropertyCallExpressionTail extends XPPropertyCallExpressionTail
{
    private PPropertyCallExpressionTail _pPropertyCallExpressionTail_;

    public X2PPropertyCallExpressionTail()
    {
    }

    public X2PPropertyCallExpressionTail(
        PPropertyCallExpressionTail _pPropertyCallExpressionTail_)
    {
        setPPropertyCallExpressionTail(_pPropertyCallExpressionTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PPropertyCallExpressionTail getPPropertyCallExpressionTail()
    {
        return _pPropertyCallExpressionTail_;
    }

    public void setPPropertyCallExpressionTail(PPropertyCallExpressionTail node)
    {
        if(_pPropertyCallExpressionTail_ != null)
        {
            _pPropertyCallExpressionTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pPropertyCallExpressionTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_pPropertyCallExpressionTail_ == child)
        {
            _pPropertyCallExpressionTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pPropertyCallExpressionTail_);
    }
}
