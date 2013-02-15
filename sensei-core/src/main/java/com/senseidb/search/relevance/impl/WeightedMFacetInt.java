package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.MultiValueWithWeightFacetDataCache;
import com.browseengine.bobo.facets.data.TermIntList;
import org.apache.lucene.search.DocIdSetIterator;

public class WeightedMFacetInt extends MFacetInt implements WeightedMFacet
{

  MultiValueWithWeightFacetDataCache _wmDataCaches;
  public WeightedMFacetInt(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
    
    _wmDataCaches = (MultiValueWithWeightFacetDataCache) mDataCaches;
  }


  @Override
  public int getWeight()
  {
    return _weight;
  }

  public int getWeight(int target)
  {
    TermIntList intList = (TermIntList) _mTermList;
    int index = intList.indexOf(target);

    _weight = _wmDataCaches.getWeightForValue(_id, index, Integer.MIN_VALUE);
    return _weight;
  }
}
