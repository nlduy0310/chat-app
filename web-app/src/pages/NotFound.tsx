import { Link } from "react-router-dom";

export default function NotFound() {
	return (
		<>
			<div className="text-red-500">This page is not available!</div>
			<Link to="/">
				<button className="btn">Back to home</button>
			</Link>
		</>
	);
}
