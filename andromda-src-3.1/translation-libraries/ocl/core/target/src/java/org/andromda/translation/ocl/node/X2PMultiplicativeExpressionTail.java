/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PMultiplicativeExpressionTail extends XPMultiplicativeExpressionTail
{
    private PMultiplicativeExpressionTail _pMultiplicativeExpressionTail_;

    public X2PMultiplicativeExpressionTail()
    {
    }

    public X2PMultiplicativeExpressionTail(
        PMultiplicativeExpressionTail _pMultiplicativeExpressionTail_)
    {
        setPMultiplicativeExpressionTail(_pMultiplicativeExpressionTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PMultiplicativeExpressionTail getPMultiplicativeExpressionTail()
    {
        return _pMultiplicativeExpressionTail_;
    }

    public void setPMultiplicativeExpressionTail(PMultiplicativeExpressionTail node)
    {
        if(_pMultiplicativeExpressionTail_ != null)
        {
            _pMultiplicativeExpressionTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pMultiplicativeExpressionTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_pMultiplicativeExpressionTail_ == child)
        {
            _pMultiplicativeExpressionTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pMultiplicativeExpressionTail_);
    }
}
