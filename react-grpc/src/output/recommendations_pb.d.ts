import * as jspb from 'google-protobuf'



export class RecommendationRequest extends jspb.Message {
  getUserId(): number;
  setUserId(value: number): RecommendationRequest;

  getCategory(): BookCategory;
  setCategory(value: BookCategory): RecommendationRequest;

  getMaxResults(): number;
  setMaxResults(value: number): RecommendationRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RecommendationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RecommendationRequest): RecommendationRequest.AsObject;
  static serializeBinaryToWriter(message: RecommendationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RecommendationRequest;
  static deserializeBinaryFromReader(message: RecommendationRequest, reader: jspb.BinaryReader): RecommendationRequest;
}

export namespace RecommendationRequest {
  export type AsObject = {
    userId: number,
    category: BookCategory,
    maxResults: number,
  }
}

export class BookRecommendation extends jspb.Message {
  getId(): number;
  setId(value: number): BookRecommendation;

  getTitle(): string;
  setTitle(value: string): BookRecommendation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): BookRecommendation.AsObject;
  static toObject(includeInstance: boolean, msg: BookRecommendation): BookRecommendation.AsObject;
  static serializeBinaryToWriter(message: BookRecommendation, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): BookRecommendation;
  static deserializeBinaryFromReader(message: BookRecommendation, reader: jspb.BinaryReader): BookRecommendation;
}

export namespace BookRecommendation {
  export type AsObject = {
    id: number,
    title: string,
  }
}

export class RecommendationResponse extends jspb.Message {
  getRecommendationsList(): Array<BookRecommendation>;
  setRecommendationsList(value: Array<BookRecommendation>): RecommendationResponse;
  clearRecommendationsList(): RecommendationResponse;
  addRecommendations(value?: BookRecommendation, index?: number): BookRecommendation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RecommendationResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RecommendationResponse): RecommendationResponse.AsObject;
  static serializeBinaryToWriter(message: RecommendationResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RecommendationResponse;
  static deserializeBinaryFromReader(message: RecommendationResponse, reader: jspb.BinaryReader): RecommendationResponse;
}

export namespace RecommendationResponse {
  export type AsObject = {
    recommendationsList: Array<BookRecommendation.AsObject>,
  }
}

export enum BookCategory { 
  MYSTERY = 0,
  SCIENCE_FICTION = 1,
  SELF_HELP = 2,
}
