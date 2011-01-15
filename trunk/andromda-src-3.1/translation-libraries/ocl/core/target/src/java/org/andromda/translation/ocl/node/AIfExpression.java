/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AIfExpression extends PIfExpression
{
    private TIf _if_;
    private PExpression _ifBranch_;
    private TThen _then_;
    private PExpression _thenBranch_;
    private TElse _else_;
    private PExpression _elseBranch_;
    private TEndif _endif_;

    public AIfExpression()
    {
    }

    public AIfExpression(
        TIf _if_,
        PExpression _ifBranch_,
        TThen _then_,
        PExpression _thenBranch_,
        TElse _else_,
        PExpression _elseBranch_,
        TEndif _endif_)
    {
        setIf(_if_);

        setIfBranch(_ifBranch_);

        setThen(_then_);

        setThenBranch(_thenBranch_);

        setElse(_else_);

        setElseBranch(_elseBranch_);

        setEndif(_endif_);

    }
    public Object clone()
    {
        return new AIfExpression(
            (TIf) cloneNode(_if_),
            (PExpression) cloneNode(_ifBranch_),
            (TThen) cloneNode(_then_),
            (PExpression) cloneNode(_thenBranch_),
            (TElse) cloneNode(_else_),
            (PExpression) cloneNode(_elseBranch_),
            (TEndif) cloneNode(_endif_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfExpression(this);
    }

    public TIf getIf()
    {
        return _if_;
    }

    public void setIf(TIf node)
    {
        if(_if_ != null)
        {
            _if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _if_ = node;
    }

    public PExpression getIfBranch()
    {
        return _ifBranch_;
    }

    public void setIfBranch(PExpression node)
    {
        if(_ifBranch_ != null)
        {
            _ifBranch_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ifBranch_ = node;
    }

    public TThen getThen()
    {
        return _then_;
    }

    public void setThen(TThen node)
    {
        if(_then_ != null)
        {
            _then_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _then_ = node;
    }

    public PExpression getThenBranch()
    {
        return _thenBranch_;
    }

    public void setThenBranch(PExpression node)
    {
        if(_thenBranch_ != null)
        {
            _thenBranch_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _thenBranch_ = node;
    }

    public TElse getElse()
    {
        return _else_;
    }

    public void setElse(TElse node)
    {
        if(_else_ != null)
        {
            _else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _else_ = node;
    }

    public PExpression getElseBranch()
    {
        return _elseBranch_;
    }

    public void setElseBranch(PExpression node)
    {
        if(_elseBranch_ != null)
        {
            _elseBranch_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _elseBranch_ = node;
    }

    public TEndif getEndif()
    {
        return _endif_;
    }

    public void setEndif(TEndif node)
    {
        if(_endif_ != null)
        {
            _endif_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _endif_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_if_)
            + toString(_ifBranch_)
            + toString(_then_)
            + toString(_thenBranch_)
            + toString(_else_)
            + toString(_elseBranch_)
            + toString(_endif_);
    }

    void removeChild(Node child)
    {
        if(_if_ == child)
        {
            _if_ = null;
            return;
        }

        if(_ifBranch_ == child)
        {
            _ifBranch_ = null;
            return;
        }

        if(_then_ == child)
        {
            _then_ = null;
            return;
        }

        if(_thenBranch_ == child)
        {
            _thenBranch_ = null;
            return;
        }

        if(_else_ == child)
        {
            _else_ = null;
            return;
        }

        if(_elseBranch_ == child)
        {
            _elseBranch_ = null;
            return;
        }

        if(_endif_ == child)
        {
            _endif_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(_ifBranch_ == oldChild)
        {
            setIfBranch((PExpression) newChild);
            return;
        }

        if(_then_ == oldChild)
        {
            setThen((TThen) newChild);
            return;
        }

        if(_thenBranch_ == oldChild)
        {
            setThenBranch((PExpression) newChild);
            return;
        }

        if(_else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(_elseBranch_ == oldChild)
        {
            setElseBranch((PExpression) newChild);
            return;
        }

        if(_endif_ == oldChild)
        {
            setEndif((TEndif) newChild);
            return;
        }

    }
}