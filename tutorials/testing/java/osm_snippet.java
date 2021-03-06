import bridges.connect.Bridges;
import bridges.connect.DataSource;
import bridges.data_src_dependent.OsmData;
import bridges.data_src_dependent.OsmVertex;
import bridges.data_src_dependent.OsmEdge;


// An example program fragment to illustrate how to retrieve Open Street map  data.
// The program rertrieves the map of UNC Charlotte campus, prints the number of vertices
// and edges, and the location of the first vertex

public class osm_snippet {
    public static void main(String[] args) throws Exception {

        //create the Bridges object
        Bridges bridges = new Bridges(YOUR_ASSIGNMENT_NUMBER, "YOUR_USER_ID", "YOUR_API_KEY");

		DataSource  ds = bridges.getDataSource();
		OsmData osm_data = ds.getOsmDataOld("uncc_campus");

		OsmVertex[] vertices = osm_data.getVertices();
		OsmEdge[] edges = osm_data.getEdges();

		System.out.println("Number of Vertices [UNC Charlotte Campus]:" + vertices.length);
		System.out.println("Number of Edges [UNC Charlotte Campus]:" + edges.length);

		// get cartesian coordinate  location of first vertex
		double[] coords = osm_data.getVertices()[0].getCartesian_coord();
		System.out.println ("Location of first vertex [Cartesian Coord]: " +  coords[0] + ","
						+ coords[1]);
	}
}
