/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ACollectionLit extends PCollectionLit
{
    private PCollectionKind _collectionKind_;
    private TLBrace _lBrace_;
    private PExpressionListOrRange _expressionListOrRange_;
    private TRBrace _rBrace_;

    public ACollectionLit()
    {
    }

    public ACollectionLit(
        PCollectionKind _collectionKind_,
        TLBrace _lBrace_,
        PExpressionListOrRange _expressionListOrRange_,
        TRBrace _rBrace_)
    {
        setCollectionKind(_collectionKind_);

        setLBrace(_lBrace_);

        setExpressionListOrRange(_expressionListOrRange_);

        setRBrace(_rBrace_);

    }
    public Object clone()
    {
        return new ACollectionLit(
            (PCollectionKind) cloneNode(_collectionKind_),
            (TLBrace) cloneNode(_lBrace_),
            (PExpressionListOrRange) cloneNode(_expressionListOrRange_),
            (TRBrace) cloneNode(_rBrace_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACollectionLit(this);
    }

    public PCollectionKind getCollectionKind()
    {
        return _collectionKind_;
    }

    public void setCollectionKind(PCollectionKind node)
    {
        if(_collectionKind_ != null)
        {
            _collectionKind_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _collectionKind_ = node;
    }

    public TLBrace getLBrace()
    {
        return _lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(_lBrace_ != null)
        {
            _lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBrace_ = node;
    }

    public PExpressionListOrRange getExpressionListOrRange()
    {
        return _expressionListOrRange_;
    }

    public void setExpressionListOrRange(PExpressionListOrRange node)
    {
        if(_expressionListOrRange_ != null)
        {
            _expressionListOrRange_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expressionListOrRange_ = node;
    }

    public TRBrace getRBrace()
    {
        return _rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(_rBrace_ != null)
        {
            _rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBrace_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_collectionKind_)
            + toString(_lBrace_)
            + toString(_expressionListOrRange_)
            + toString(_rBrace_);
    }

    void removeChild(Node child)
    {
        if(_collectionKind_ == child)
        {
            _collectionKind_ = null;
            return;
        }

        if(_lBrace_ == child)
        {
            _lBrace_ = null;
            return;
        }

        if(_expressionListOrRange_ == child)
        {
            _expressionListOrRange_ = null;
            return;
        }

        if(_rBrace_ == child)
        {
            _rBrace_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_collectionKind_ == oldChild)
        {
            setCollectionKind((PCollectionKind) newChild);
            return;
        }

        if(_lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        if(_expressionListOrRange_ == oldChild)
        {
            setExpressionListOrRange((PExpressionListOrRange) newChild);
            return;
        }

        if(_rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

    }
}
