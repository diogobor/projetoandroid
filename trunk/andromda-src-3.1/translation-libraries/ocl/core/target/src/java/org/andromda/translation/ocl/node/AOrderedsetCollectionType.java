/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AOrderedsetCollectionType extends PCollectionType
{
    private TOrderedset _orderedset_;
    private TLParen _lParen_;
    private PType _type_;
    private TRParen _rParen_;

    public AOrderedsetCollectionType()
    {
    }

    public AOrderedsetCollectionType(
        TOrderedset _orderedset_,
        TLParen _lParen_,
        PType _type_,
        TRParen _rParen_)
    {
        setOrderedset(_orderedset_);

        setLParen(_lParen_);

        setType(_type_);

        setRParen(_rParen_);

    }
    public Object clone()
    {
        return new AOrderedsetCollectionType(
            (TOrderedset) cloneNode(_orderedset_),
            (TLParen) cloneNode(_lParen_),
            (PType) cloneNode(_type_),
            (TRParen) cloneNode(_rParen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrderedsetCollectionType(this);
    }

    public TOrderedset getOrderedset()
    {
        return _orderedset_;
    }

    public void setOrderedset(TOrderedset node)
    {
        if(_orderedset_ != null)
        {
            _orderedset_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _orderedset_ = node;
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

    public PType getType()
    {
        return _type_;
    }

    public void setType(PType node)
    {
        if(_type_ != null)
        {
            _type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _type_ = node;
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
            + toString(_orderedset_)
            + toString(_lParen_)
            + toString(_type_)
            + toString(_rParen_);
    }

    void removeChild(Node child)
    {
        if(_orderedset_ == child)
        {
            _orderedset_ = null;
            return;
        }

        if(_lParen_ == child)
        {
            _lParen_ = null;
            return;
        }

        if(_type_ == child)
        {
            _type_ = null;
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
        if(_orderedset_ == oldChild)
        {
            setOrderedset((TOrderedset) newChild);
            return;
        }

        if(_lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(_type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(_rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

    }
}