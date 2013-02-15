package com.senseidb.search.relevance.impl;

import com.browseengine.bobo.facets.data.MultiValueFacetDataCache;
import com.browseengine.bobo.facets.data.MultiValueWithWeightFacetDataCache;
import com.browseengine.bobo.facets.data.TermFloatList;
import com.browseengine.bobo.facets.data.TermIntList;
import org.apache.lucene.search.DocIdSetIterator;

public class WeightedMFacetFloat extends MFacetFloat implements WeightedMFacet
{

  MultiValueWithWeightFacetDataCache _wmDataCaches;
  public WeightedMFacetFloat(MultiValueFacetDataCache mDataCaches)
  {
    super(mDataCaches);
    
    _wmDataCaches = (MultiValueWithWeightFacetDataCache) mDataCaches;
  }

  @Override
  public int getWeight()
  {
    return _weight;
  }

    public int getWeight(float target)
    {
        TermFloatList intList = (TermFloatList) _mTermList;
        int index = intList.indexOf(target);

        _weight = _wmDataCaches.getWeightForValue(_id, index, Integer.MIN_VALUE);
        return _weight;
    }
}
