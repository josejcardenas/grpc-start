import './App.css';
import { RecommendationsClient } from './output/RecommendationsServiceClientPb';
import { BookCategory, RecommendationRequest, RecommendationResponse } from './output/recommendations_pb';

function App() {

  const grpcCall = () => {

    // prepare the request
    const request = new RecommendationRequest();
    request.setUserId(1);
    request.setCategory(BookCategory.SCIENCE_FICTION);
    request.setMaxResults(3);

    // create gRPC client that will call ou java server
    // eslint-disable-next-line
    const client = new RecommendationsClient('http://localhost:8080')
                .recommend(request, {}, (err, response: RecommendationResponse) => {
            console.log({err, response});
        });
    }

return (
      <div>
         <button onClick={grpcCall}>Click</button>
      </div>
 );
}

export default App;