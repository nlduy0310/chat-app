import { MoveRight } from "lucide-react";
import { Link } from "react-router-dom";

export default function Login() {
	return (
		<div className="w-screen h-screen flex justify-center items-center">
			<div className="bg-base-200 w-xs px-8 py-4 rounded-box border border-base-300">
				<fieldset className="fieldset">
					<legend className="fieldset-legend text-2xl text-center">
						Log In
					</legend>
					<label className="fieldset-label" htmlFor="email">
						Email
					</label>
					<input
						className="input"
						type="email"
						id="email"
						placeholder="Email"
					/>

					<label className="fieldset-label" htmlFor="password">
						Password
					</label>
					<input
						className="input"
						type="password"
						id="password"
						placeholder="Password"
					/>

					<button className="btn btn-neutral mt-4">
						<MoveRight size={"2rem"} />
					</button>

					<div className="text-center mt-2">
						<Link to="/signup">
							<button className="btn btn-link btn-sm p-0">
								New user?
							</button>
						</Link>
						{" / "}
						<button className="btn btn-link btn-sm p-0">
							Forgot password?
						</button>
						{/* // TODO add forgot password page */}
					</div>
				</fieldset>
				{/* // TODO add google login option */}
			</div>
		</div>
	);
}
