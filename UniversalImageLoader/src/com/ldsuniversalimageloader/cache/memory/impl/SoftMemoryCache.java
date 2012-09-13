package com.ldsuniversalimageloader.cache.memory.impl;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

import android.graphics.Bitmap;

import com.nostra13.universalimageloader.cache.memory.BaseMemoryCache;

public class SoftMemoryCache extends BaseMemoryCache<String, Bitmap> {

	@Override
	protected Reference<Bitmap> createReference(Bitmap value) {
		return new SoftReference<Bitmap>(value);
	}

}
