import { Link } from "react-router-dom";
export default function Home() {
	return (
		<div className="w-screen h-screen flex justify-center items-center">
			<div className="flex flex-col items-center justify-center gap-4">
				{/* Title */}
				<h1 className="font-extrabold text-6xl tracking-[0.3em] mr-[-0.3em] mb-8 text-white">
					DIALOGS
				</h1>
				{/* Heading */}
				<div className="text-2xl tracking-wide ">Welcome back!</div>
				{/* Actions */}
				<div className="w-60">
					<Link to="/login">
						<button className="btn btn-neutral btn-xl btn-wide">
							Log In
						</button>
					</Link>
					<div className="my-2 text-lg text-center italic text-gray-200 font-light">
						OR
					</div>
					<Link to="/signup">
						<button className="btn btn-xl btn-neutral btn-wide">
							Sign Up
						</button>
					</Link>
				</div>
			</div>
		</div>
	);
}
