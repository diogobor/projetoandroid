/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PAdditiveExpressionTail extends XPAdditiveExpressionTail
{
    private PAdditiveExpressionTail _pAdditiveExpressionTail_;

    public X2PAdditiveExpressionTail()
    {
    }

    public X2PAdditiveExpressionTail(
        PAdditiveExpressionTail _pAdditiveExpressionTail_)
    {
        setPAdditiveExpressionTail(_pAdditiveExpressionTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PAdditiveExpressionTail getPAdditiveExpressionTail()
    {
        return _pAdditiveExpressionTail_;
    }

    public void setPAdditiveExpressionTail(PAdditiveExpressionTail node)
    {
        if(_pAdditiveExpressionTail_ != null)
        {
            _pAdditiveExpressionTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pAdditiveExpressionTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_pAdditiveExpressionTail_ == child)
        {
            _pAdditiveExpressionTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pAdditiveExpressionTail_);
    }
}
