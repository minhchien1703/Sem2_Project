

function HeaderComponent() {
    return (
        <>
            <div className="wrapper">
                <header className="header-wrapper">
                    <div className="header-area">
                        <div className="container">
                            <div className="row align-items-center">
                                <div className="col-xl-2 col-lg-2 col-6">
                                    <div className="header-logo">
                                        <a href="index.html">
                                            <img
                                                className="logo-main"
                                                src="assets/images/logo.png"
                                                width={125}
                                                height={25}
                                                alt="Logo"
                                            />
                                        </a>
                                    </div>
                                </div>
                                <div className="col-xl-8 col-lg-7 d-none d-lg-block">
                                    <div className="header-navigation">
                                        <ul className="main-nav">
                                            <li className="main-nav-item has-submenu">
                                                <a className="main-nav-link" href="index.html">
                                                    Home
                                                </a>
                                            </li>
                                            <li className="main-nav-item has-submenu">
                                                <a className="main-nav-link" href="blog.html">
                                                    Blog
                                                </a>
                                                <ul className="submenu-nav">
                                                    <li className="submenu-nav-item">
                                                        <a className="submenu-nav-link" href="blog-details.html">
                                                            Blog Details
                                                        </a>
                                                    </li>
                                                    <li className="submenu-nav-item">
                                                        <a
                                                            className="submenu-nav-link"
                                                            href="blog-details-left-sidebar.html"
                                                        >
                                                            Blog Details Left Sidebar
                                                        </a>
                                                    </li>
                                                    <li className="submenu-nav-item">
                                                        <a
                                                            className="submenu-nav-link"
                                                            href="blog-details-right-sidebar.html"
                                                        >
                                                            Blog Details Right Sidebar
                                                        </a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li className="main-nav-item has-submenu position-static">
                                                <a className="main-nav-link" href="shop.html">
                                                    Shop
                                                </a>
                                                <ul className="submenu-nav-mega">
                                                    <li className="submenu-nav-mega-item">
                                                        <a href="shop.html" className="mega-title">
                                                            Shop Layout
                                                        </a>
                                                        <ul>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-three-columns.html"
                                                                >
                                                                    Shop 3 Column
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-four-columns.html"
                                                                >
                                                                    Shop 4 Column
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a className="submenu-nav-mega-link" href="shop.html">
                                                                    Shop Left Sidebar
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-right-sidebar.html"
                                                                >
                                                                    Shop Right Sidebar
                                                                </a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li className="submenu-nav-mega-item">
                                                        <a href="shop-single-product.html" className="mega-title">
                                                            Single Product
                                                        </a>
                                                        <ul>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-single-product.html"
                                                                >
                                                                    Single Product Normal
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-single-product-sticky-content.html"
                                                                >
                                                                    Product Sticky Content
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-single-product-thumbnail-right.html"
                                                                >
                                                                    Product Thumbnail Right
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-single-product-gallery.html"
                                                                >
                                                                    Single Product Gallery
                                                                </a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li className="submenu-nav-mega-item">
                                                        <a href="shop-cart.html" className="mega-title">
                                                            Others Pages
                                                        </a>
                                                        <ul>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-cart.html"
                                                                >
                                                                    Shopping Cart
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-checkout.html"
                                                                >
                                                                    Checkout
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-wishlist.html"
                                                                >
                                                                    Wishlist
                                                                </a>
                                                            </li>
                                                            <li>
                                                                <a
                                                                    className="submenu-nav-mega-link"
                                                                    href="shop-compare.html"
                                                                >
                                                                    Compare
                                                                </a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li className="main-nav-item">
                                                <a className="main-nav-link" href="contact.html">
                                                    Contact
                                                </a>
                                            </li>
                                            <li className="main-nav-item">
                                                <a className="main-nav-link" href="about-us.html">
                                                    About
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div className="col-xl-2 col-lg-3 col-6">
                                    <div className="header-action d-flex align-items-center justify-content-end">
                                        <button
                                            className="btn-search-menu d-none d-lg-block"
                                            type="button"
                                            data-bs-toggle="offcanvas"
                                            data-bs-target="#AsideOffcanvasSearch"
                                            aria-controls="AsideOffcanvasSearch"
                                        >
                                            <svg
                                                aria-hidden="true"
                                                focusable="false"
                                                data-prefix="far"
                                                data-icon="search"
                                                role="img"
                                                xmlns="http://www.w3.org/2000/svg"
                                                viewBox="0 0 512 512"
                                                className="svg-inline--fa fa-search"
                                            >
                                                <path
                                                    fill="currentColor"
                                                    d="M508.5 468.9L387.1 347.5c-2.3-2.3-5.3-3.5-8.5-3.5h-13.2c31.5-36.5 50.6-84 50.6-136C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c52 0 99.5-19.1 136-50.6v13.2c0 3.2 1.3 6.2 3.5 8.5l121.4 121.4c4.7 4.7 12.3 4.7 17 0l22.6-22.6c4.7-4.7 4.7-12.3 0-17zM208 368c-88.4 0-160-71.6-160-160S119.6 48 208 48s160 71.6 160 160-71.6 160-160 160z"
                                                    className=""
                                                />
                                            </svg>
                                        </button>
                                        <button
                                            className="header-action-cart"
                                            type="button"
                                            data-bs-toggle="offcanvas"
                                            data-bs-target="#offcanvasWithCartSidebar"
                                            aria-controls="offcanvasWithCartSidebar"
                                        >
                                            <i className="cart-icon icofont-cart" />
                                            <span className="cart-amount">$58.00</span>
                                            <span className="cart-count">2</span>
                                        </button>
                                        <div className="header-info-dropdown d-none d-lg-block">
                                            <button
                                                type="button"
                                                className="btn-info dropdown-toggle"
                                                id="dropdownCurrency"
                                                data-bs-toggle="dropdown"
                                                aria-expanded="false"
                                            >
                                                <i className="icofont-gear-alt" />
                                            </button>
                                            <div
                                                className="dropdown-menu header-dropdown-menu"
                                                aria-labelledby="dropdownCurrency"
                                            >
                                                <h6 className="header-dropdown-menu-title">Currency</h6>
                                                <ul>
                                                    <li>
                                                        <a href="javascript:void(0)">USD - US Dollar</a>
                                                    </li>
                                                    <li>
                                                        <a href="javascript:void(0)">EUR - Euro</a>
                                                    </li>
                                                    <li>
                                                        <a href="javascript:void(0)">GBP - British Pound</a>
                                                    </li>
                                                </ul>
                                                <h6 className="header-dropdown-menu-title style-two">
                                                    Account
                                                </h6>
                                                <ul>
                                                    <li>
                                                        <a href="login-register.html">Login</a>
                                                    </li>
                                                    <li>
                                                        <a href="login-register.html">Register</a>
                                                    </li>
                                                    <li>
                                                        <a href="account.html">My Account</a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <button
                                            className="btn-menu-two d-lg-none me-0"
                                            type="button"
                                            data-bs-toggle="offcanvas"
                                            data-bs-target="#offcanvasWithBothOptions"
                                            aria-controls="offcanvasWithBothOptions"
                                        >
                                            <i className="icon-menu" />
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </header>

            </div>
        </>
    )
}

export default HeaderComponent;