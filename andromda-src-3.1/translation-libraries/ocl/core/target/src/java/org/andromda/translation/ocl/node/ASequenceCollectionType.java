/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ASequenceCollectionType extends PCollectionType
{
    private TSequence _sequence_;
    private TLParen _lParen_;
    private PType _type_;
    private TRParen _rParen_;

    public ASequenceCollectionType()
    {
    }

    public ASequenceCollectionType(
        TSequence _sequence_,
        TLParen _lParen_,
        PType _type_,
        TRParen _rParen_)
    {
        setSequence(_sequence_);

        setLParen(_lParen_);

        setType(_type_);

        setRParen(_rParen_);

    }
    public Object clone()
    {
        return new ASequenceCollectionType(
            (TSequence) cloneNode(_sequence_),
            (TLParen) cloneNode(_lParen_),
            (PType) cloneNode(_type_),
            (TRParen) cloneNode(_rParen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASequenceCollectionType(this);
    }

    public TSequence getSequence()
    {
        return _sequence_;
    }

    public void setSequence(TSequence node)
    {
        if(_sequence_ != null)
        {
            _sequence_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _sequence_ = node;
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
            + toString(_sequence_)
            + toString(_lParen_)
            + toString(_type_)
            + toString(_rParen_);
    }

    void removeChild(Node child)
    {
        if(_sequence_ == child)
        {
            _sequence_ = null;
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
        if(_sequence_ == oldChild)
        {
            setSequence((TSequence) newChild);
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
