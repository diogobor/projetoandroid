/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X1PMultiplicativeExpressionTail extends XPMultiplicativeExpressionTail
{
    private XPMultiplicativeExpressionTail _xPMultiplicativeExpressionTail_;
    private PMultiplicativeExpressionTail _pMultiplicativeExpressionTail_;

    public X1PMultiplicativeExpressionTail()
    {
    }

    public X1PMultiplicativeExpressionTail(
        XPMultiplicativeExpressionTail _xPMultiplicativeExpressionTail_,
        PMultiplicativeExpressionTail _pMultiplicativeExpressionTail_)
    {
        setXPMultiplicativeExpressionTail(_xPMultiplicativeExpressionTail_);
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

    public XPMultiplicativeExpressionTail getXPMultiplicativeExpressionTail()
    {
        return _xPMultiplicativeExpressionTail_;
    }

    public void setXPMultiplicativeExpressionTail(XPMultiplicativeExpressionTail node)
    {
        if(_xPMultiplicativeExpressionTail_ != null)
        {
            _xPMultiplicativeExpressionTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPMultiplicativeExpressionTail_ = node;
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
        if(_xPMultiplicativeExpressionTail_ == child)
        {
            _xPMultiplicativeExpressionTail_ = null;
        }

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
            toString(_xPMultiplicativeExpressionTail_) +
            toString(_pMultiplicativeExpressionTail_);
    }
}
