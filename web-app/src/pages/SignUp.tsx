import { MoveRight } from "lucide-react";
import { Link } from "react-router-dom";
export default function SignUp() {
	return (
		<div className="w-screen h-screen flex items-center justify-center">
			<div className="w-xs px-8 py-4 bg-base-200 border border-base-300 rounded-box">
				<fieldset className="fieldset">
					<legend className="fieldset-legend text-2xl text-center">
						Sign Up
					</legend>

					<label className="fieldset-label" htmlFor="full-name">
						Full name
					</label>
					<input
						className="input"
						type="text"
						name="full-name"
						id="full-name"
						placeholder="Full name"
					/>

					<label className="fieldset-label" htmlFor="email">
						Email
					</label>
					<input
						className="input"
						type="email"
						name="email"
						id="email"
						placeholder="Email"
					/>

					<label className="fieldset-label" htmlFor="password">
						Password
					</label>
					<input
						className="input"
						type="password"
						name="password"
						id="password"
						placeholder="Password"
					/>

					<label
						className="fieldset-label"
						htmlFor="password-confirm"
					>
						Confirm password
					</label>
					<input
						className="input"
						type="password"
						name="password-confirm"
						id="password-confirm"
						placeholder="Confirm password"
					/>

					<button className="btn btn-neutral mt-4">
						<MoveRight size="2rem" />
					</button>

					<Link to="/login" className="text-center">
						<button className="btn btn-link mt-2">
							Already have an account?
						</button>
					</Link>
				</fieldset>
			</div>
		</div>
	);
}
