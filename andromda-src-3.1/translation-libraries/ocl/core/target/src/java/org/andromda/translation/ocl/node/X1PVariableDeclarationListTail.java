/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X1PVariableDeclarationListTail extends XPVariableDeclarationListTail
{
    private XPVariableDeclarationListTail _xPVariableDeclarationListTail_;
    private PVariableDeclarationListTail _pVariableDeclarationListTail_;

    public X1PVariableDeclarationListTail()
    {
    }

    public X1PVariableDeclarationListTail(
        XPVariableDeclarationListTail _xPVariableDeclarationListTail_,
        PVariableDeclarationListTail _pVariableDeclarationListTail_)
    {
        setXPVariableDeclarationListTail(_xPVariableDeclarationListTail_);
        setPVariableDeclarationListTail(_pVariableDeclarationListTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPVariableDeclarationListTail getXPVariableDeclarationListTail()
    {
        return _xPVariableDeclarationListTail_;
    }

    public void setXPVariableDeclarationListTail(XPVariableDeclarationListTail node)
    {
        if(_xPVariableDeclarationListTail_ != null)
        {
            _xPVariableDeclarationListTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPVariableDeclarationListTail_ = node;
    }

    public PVariableDeclarationListTail getPVariableDeclarationListTail()
    {
        return _pVariableDeclarationListTail_;
    }

    public void setPVariableDeclarationListTail(PVariableDeclarationListTail node)
    {
        if(_pVariableDeclarationListTail_ != null)
        {
            _pVariableDeclarationListTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pVariableDeclarationListTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPVariableDeclarationListTail_ == child)
        {
            _xPVariableDeclarationListTail_ = null;
        }

        if(_pVariableDeclarationListTail_ == child)
        {
            _pVariableDeclarationListTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPVariableDeclarationListTail_) +
            toString(_pVariableDeclarationListTail_);
    }
}
