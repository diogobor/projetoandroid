/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X1PAttributeOrAssociationExpressionBody extends XPAttributeOrAssociationExpressionBody
{
    private XPAttributeOrAssociationExpressionBody _xPAttributeOrAssociationExpressionBody_;
    private PAttributeOrAssociationExpressionBody _pAttributeOrAssociationExpressionBody_;

    public X1PAttributeOrAssociationExpressionBody()
    {
    }

    public X1PAttributeOrAssociationExpressionBody(
        XPAttributeOrAssociationExpressionBody _xPAttributeOrAssociationExpressionBody_,
        PAttributeOrAssociationExpressionBody _pAttributeOrAssociationExpressionBody_)
    {
        setXPAttributeOrAssociationExpressionBody(_xPAttributeOrAssociationExpressionBody_);
        setPAttributeOrAssociationExpressionBody(_pAttributeOrAssociationExpressionBody_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPAttributeOrAssociationExpressionBody getXPAttributeOrAssociationExpressionBody()
    {
        return _xPAttributeOrAssociationExpressionBody_;
    }

    public void setXPAttributeOrAssociationExpressionBody(XPAttributeOrAssociationExpressionBody node)
    {
        if(_xPAttributeOrAssociationExpressionBody_ != null)
        {
            _xPAttributeOrAssociationExpressionBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPAttributeOrAssociationExpressionBody_ = node;
    }

    public PAttributeOrAssociationExpressionBody getPAttributeOrAssociationExpressionBody()
    {
        return _pAttributeOrAssociationExpressionBody_;
    }

    public void setPAttributeOrAssociationExpressionBody(PAttributeOrAssociationExpressionBody node)
    {
        if(_pAttributeOrAssociationExpressionBody_ != null)
        {
            _pAttributeOrAssociationExpressionBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pAttributeOrAssociationExpressionBody_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPAttributeOrAssociationExpressionBody_ == child)
        {
            _xPAttributeOrAssociationExpressionBody_ = null;
        }

        if(_pAttributeOrAssociationExpressionBody_ == child)
        {
            _pAttributeOrAssociationExpressionBody_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPAttributeOrAssociationExpressionBody_) +
            toString(_pAttributeOrAssociationExpressionBody_);
    }
}