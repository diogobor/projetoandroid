/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ATupleType extends PTupleType
{
    private TTupletype _tupletype_;
    private TLParen _lParen_;
    private PVariableDeclarationList _variableDeclarationList_;
    private TRParen _rParen_;

    public ATupleType()
    {
    }

    public ATupleType(
        TTupletype _tupletype_,
        TLParen _lParen_,
        PVariableDeclarationList _variableDeclarationList_,
        TRParen _rParen_)
    {
        setTupletype(_tupletype_);

        setLParen(_lParen_);

        setVariableDeclarationList(_variableDeclarationList_);

        setRParen(_rParen_);

    }
    public Object clone()
    {
        return new ATupleType(
            (TTupletype) cloneNode(_tupletype_),
            (TLParen) cloneNode(_lParen_),
            (PVariableDeclarationList) cloneNode(_variableDeclarationList_),
            (TRParen) cloneNode(_rParen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATupleType(this);
    }

    public TTupletype getTupletype()
    {
        return _tupletype_;
    }

    public void setTupletype(TTupletype node)
    {
        if(_tupletype_ != null)
        {
            _tupletype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _tupletype_ = node;
    }

    public TLParen getLParen()
    {
        return _lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(_lParen_ != null)
        {
            _lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lParen_ = node;
    }

    public PVariableDeclarationList getVariableDeclarationList()
    {
        return _variableDeclarationList_;
    }

    public void setVariableDeclarationList(PVariableDeclarationList node)
    {
        if(_variableDeclarationList_ != null)
        {
            _variableDeclarationList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _variableDeclarationList_ = node;
    }

    public TRParen getRParen()
    {
        return _rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(_rParen_ != null)
        {
            _rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rParen_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_tupletype_)
            + toString(_lParen_)
            + toString(_variableDeclarationList_)
            + toString(_rParen_);
    }

    void removeChild(Node child)
    {
        if(_tupletype_ == child)
        {
            _tupletype_ = null;
            return;
        }

        if(_lParen_ == child)
        {
            _lParen_ = null;
            return;
        }

        if(_variableDeclarationList_ == child)
        {
            _variableDeclarationList_ = null;
            return;
        }

        if(_rParen_ == child)
        {
            _rParen_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_tupletype_ == oldChild)
        {
            setTupletype((TTupletype) newChild);
            return;
        }

        if(_lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(_variableDeclarationList_ == oldChild)
        {
            setVariableDeclarationList((PVariableDeclarationList) newChild);
            return;
        }

        if(_rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

    }
}
