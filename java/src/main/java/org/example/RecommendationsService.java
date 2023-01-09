package org.example;
import java.util.*;

import org.proto.RecommendationsGrpc.RecommendationsImplBase;
import org.proto.RecommendationsOuterClass.BookRecommendation;
import org.proto.RecommendationsOuterClass.BookCategory;
import io.grpc.stub.StreamObserver;
import org.proto.RecommendationsOuterClass.RecommendationRequest;
import org.proto.RecommendationsOuterClass.RecommendationResponse;

public class RecommendationsService extends RecommendationsImplBase {

    @Override
    public void recommend(RecommendationRequest request, StreamObserver<RecommendationResponse> responseObserver){
        System.out.println("You are in the recommend method or the Recommendation Service");
    }
//    public static void main(String[] args) {
//        Map<BookCategory, BookRecommendation[]> booklibrary = new HashMap<>();
//        BookRecommendation[] bookset;
//        // Mystery genre
//        bookset = new BookRecommendation[3];
//        bookset[0] = BookRecommendation.newBuilder()
//            .setId(1)
//            .setTitle("The Maltese Falcon")
//            .build();
//        bookset[1] = BookRecommendation.newBuilder()
//            .setId(2)
//            .setTitle("Murder on the Orient Express")
//            .build();
//        bookset[2] = BookRecommendation.newBuilder()
//            .setId(3)
//            .setTitle("The Hound of the Baskervilles")
//            .build();
//        booklibrary.put(BookCategory.MYSTERY, bookset);
//        // Science_fiction genre
//        bookset = new BookRecommendation[3];
//        bookset[0] = BookRecommendation.newBuilder()
//            .setId(4)
//            .setTitle("The Hitchhiker's Guide to the Galaxy")
//            .build();
//        bookset[1] = BookRecommendation.newBuilder()
//            .setId(5)
//            .setTitle("Ender's Game")
//            .build();
//        bookset[2] = BookRecommendation.newBuilder()
//            .setId(6)
//            .setTitle("The Dune Chronicles")
//            .build();
//        booklibrary.put(BookCategory.SCIENCE_FICTION, bookset);
//        // Self_help genre
//        bookset = new BookRecommendation[3];
//        bookset[0] = BookRecommendation.newBuilder()
//            .setId(7)
//            .setTitle("The 7 Habits of Highly Effective People")
//            .build();
//        bookset[1] = BookRecommendation.newBuilder()
//            .setId(8)
//            .setTitle("How to Win Friends and Influence People")
//            .build();
//        bookset[2] = BookRecommendation.newBuilder()
//            .setId(9)
//            .setTitle("Man's Search for Meaning")
//            .build();
//        booklibrary.put(BookCategory.SELF_HELP, bookset);
//
//        // looping content as test it's well conformed message.
//        Set<Map.Entry<BookCategory, BookRecommendation[]>> set = booklibrary.entrySet();
//        List<Map.Entry<BookCategory, BookRecommendation[]>> list = new ArrayList<>(set);
//        for (int i = 0; i < list.size(); i++) {
//            BookCategory bc = list.get(i).getKey();
//            System.out.println(bc);
//            BookRecommendation[] booksetp = list.get(i).getValue();
//            for (int j = 0; j < booksetp.length; j++) {
//                BookRecommendation br = booksetp[j];
//                System.out.println(br.getId());
//                System.out.println(br.getTitle());
//            }
//        }
//
////        **** Begin. Initial steps to create content and loop results ****
////        List<BookRecommendation> bookset = new ArrayList<>();
////        bookset.add(BookRecommendation.newBuilder()
////            .setId(1)
////            .setTitle("The Maltese Falcon")
////            .build()
////        );
////        bookset.add(BookRecommendation.newBuilder()
////                .setId(2)
////                .setTitle("Murder on the Orient Express")
////                .build()
////        );
////        bookset.add(BookRecommendation.newBuilder()
////                .setId(3)
////                .setTitle("The Hound of the Baskervilles")
////                .build()
////        );
////        Iterator<BookRecommendation> iterator = bookset.iterator();
////        while (iterator.hasNext()){
////            BookRecommendation br = iterator.next();
////            System.out.println(br.getId());
////            System.out.println(br.getTitle());
////        }
////        **** End. Initial steps to create content and loop results ****
//
//    }

}
