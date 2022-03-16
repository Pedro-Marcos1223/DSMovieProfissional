import { ReactComponent as GithubIcon } from 'assets/img/github.svg'
import './styles.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>MyBambooAnime</h1>
                    <a href="https://github.com/Pedro-Marcos1223">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/Pedro-Marcos1223</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;