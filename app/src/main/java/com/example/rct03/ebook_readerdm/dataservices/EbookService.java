package com.example.rct03.ebook_readerdm.dataservices;

import com.example.rct03.ebook_readerdm.models.ebooks.Ebooks;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

public interface EbookService {

    Observable<Ebooks> getEbooks(String token);

    Observable<ResponseBody> downloadEbook(String token, String url);
}
