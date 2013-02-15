package com.senseidb.search.relevance.impl;

import java.util.Set;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.TermValueList;
import com.browseengine.bobo.util.BigNestedIntArray;

public abstract class MFacet
{
  protected MultiValueFacetDataCache _mDataCaches = null;
//  protected BigNestedIntArray _nestedArray = null;
  protected TermValueList _mTermList = null;
  protected int _id;
  protected int _weight;

//  protected int[]   _buf = new int[1024];
//  protected int     _length = 0;
//  protected int[]   _weight = new int[1];

// for weighted multi-facet;
//  protected BigNestedIntArray _weightArray = null;
//  protected int[]   weightBuf = new int[1024];


  public MFacet(MultiValueFacetDataCache mDataCaches)
  {
    _mDataCaches = mDataCaches;
    _mTermList = _mDataCaches.getValArray();
//    _nestedArray = _mDataCaches._nestedArray;
  }

  public void refresh(int id)
  {
      _id = id;
//    _length = _nestedArray.getData(id, _buf);
  }

//  public int size()
//  {
//    return _length;
//  }

  abstract  public boolean containsAll(Set set);

    public boolean containsAny(Object set) {
      return _mDataCaches.containsSet(set, _id);
  }
}
